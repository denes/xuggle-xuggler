/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Used to resample {@link IAudioSamples} to different sample rates 
 * or number of channels.  
 */
public class IAudioResampler extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  protected IAudioResampler(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIAudioResamplerUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IAudioResampler obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IAudioResampler object that is actually referring to the
   * exact same underlying native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IAudioResampler copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      IAudioResampler retval = new IAudioResampler(swigCPtr, false);
      retval.acquire();
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IAudioResampler)
      equal = (((IAudioResampler)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  /**
   * Releases any underlying native memory and marks this object
   * as invalid.
   * <p>
   * Normally Ferry manages when to release native memory.
   * </p>
   * <p>
   * In the unlikely event you want to control EXACTLY when a native 
   * object is released, each Xuggler object has a {@link #delete()}
   * method that you can use. Once you call {@link #delete()},
   * you must ENSURE your object is never referenced again from
   * that Java object -- Ferry tries to help you avoid crashes if you
   * accidentally use an object after deletion but on this but we
   * cannot offer 100% protection (specifically if another thread
   *  is accessing that object EXACTLY when you {@link #delete()} it). 
   * </p>
   */
  

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }

/**
 * number of channels in output audio.  
 * @return	Number of channels we'll resample the output to.  
 */
  public int getOutputChannels() {
    return XugglerJNI.IAudioResampler_getOutputChannels(swigCPtr, this);
  }

/**
 * sample rate of output audio.  
 * @return	Sample Rate we'll resample the output to.  
 */
  public int getOutputRate() {
    return XugglerJNI.IAudioResampler_getOutputRate(swigCPtr, this);
  }

/**
 * number of channels expected in input audio.  
 * @return	Number of channels we'll expect in the input samples  
 */
  public int getInputChannels() {
    return XugglerJNI.IAudioResampler_getInputChannels(swigCPtr, this);
  }

/**
 * sample rate expected in input audio.  
 * @return	Sample rate we'll expect in the input samples  
 */
  public int getInputRate() {
    return XugglerJNI.IAudioResampler_getInputRate(swigCPtr, this);
  }

/**
 * Re-sample up to numSamples from inputSamples to outputSamples.  
 * This function re-samples the audio in inputSamples to have the same 
 *  
 * number of channels, and the same sample rate, as this {@link IAudioResampler} 
 * was  
 * initialized with.  
 * @param	outputSamples [out] The sample buffer we output to.  
 * @param	inputSamples [in] The samples we're going to re-sample.  
 * @param	numSamples [in] The number of samples from inputSamples to 
 *		 use. if 0,  
 * this defaults to inputSamples.getNumSamples().  
 * @return	Number of samples written to outputSamples, or <0 on error. 
 *		  
 */
  public int resample(IAudioSamples outputSamples, IAudioSamples inputSamples, long numSamples) {
    return XugglerJNI.IAudioResampler_resample(swigCPtr, this, IAudioSamples.getCPtr(outputSamples), outputSamples, IAudioSamples.getCPtr(inputSamples), inputSamples, numSamples);
  }

/**
 * Create a new {@link IAudioResampler} object.  
 * <p>  
 * Creation of {@link IAudioResampler} objects is relatively expensive 
 * compared  
 * to the {@link #resample(IAudioSamples, IAudioSamples, long)} method, 
 *  
 * so users are encouraged to create once and use often.  
 * </p>  
 * <p>  
 * This method assumes all samples are in IAudioSamples.Format.FMT_S16 
 * format.  
 * </p>  
 * @param	outputChannels The number of channels you will want  
 * in resampled audio we output.  
 * @param	inputChannels The number of channels you will pass  
 * in the source audio for resampling.  
 * @param	outputRate The sample rate you will want  
 * in resampled audio we output.  
 * @param	inputRate The sample rate you will pass  
 * in the source audio for resampling.  
 * @return	A new object, or null if we can't allocate one.  
 */
  public static IAudioResampler make(int outputChannels, int inputChannels, int outputRate, int inputRate) {
    long cPtr = XugglerJNI.IAudioResampler_make__SWIG_0(outputChannels, inputChannels, outputRate, inputRate);
    return (cPtr == 0) ? null : new IAudioResampler(cPtr, false);
  }

/**
 * Get the sample format we expect to resample to.  
 * @return	the sample format for output.  
 */
  public IAudioSamples.Format getOutputFormat() {
    return IAudioSamples.Format.swigToEnum(XugglerJNI.IAudioResampler_getOutputFormat(swigCPtr, this));
  }

/**
 * Get the sample format we expect to resample from.  
 * @return	the sample format for input.  
 */
  public IAudioSamples.Format getInputFormat() {
    return IAudioSamples.Format.swigToEnum(XugglerJNI.IAudioResampler_getInputFormat(swigCPtr, this));
  }

/**
 * Get the length of each filter in the resampler filter bank.  
 * @return	the filter length  
 */
  public int getFilterLen() {
    return XugglerJNI.IAudioResampler_getFilterLen(swigCPtr, this);
  }

/**
 * Get log2(number of entries in filter bank).  
 * @return	log2(number of entries in filter bank).  
 */
  public int getLog2PhaseCount() {
    return XugglerJNI.IAudioResampler_getLog2PhaseCount(swigCPtr, this);
  }

/**
 * Are we linearly interpolating between filters?  
 * @return	true if interpolating, false if just choosing closest.  
 */
  public boolean isLinear() {
    return XugglerJNI.IAudioResampler_isLinear(swigCPtr, this);
  }

/**
 * What is the cuttoff frequency used?  
 * @return	the cuttoff frequency  
 */
  public double getCutoffFrequency() {
    return XugglerJNI.IAudioResampler_getCutoffFrequency(swigCPtr, this);
  }

/**
 * Create a new {@link IAudioResampler} object.  
 * <p>  
 * Creation of {@link IAudioResampler} objects is relatively expensive 
 * compared  
 * to the {@link #resample(IAudioSamples, IAudioSamples, long)} method, 
 *  
 * so users are encouraged to create once and use often.  
 * </p>  
 * <p>  
 * &quot;Sensible&quot; defaults are passed in for filter length and 
 * other  
 * parameters.  
 * </p>  
 * @param	outputChannels The number of channels you will want  
 * in resampled audio we output.  
 * @param	inputChannels The number of channels you will pass  
 * in the source audio for resampling.  
 * @param	outputRate The sample rate you will want  
 * in resampled audio we output.  
 * @param	inputRate The sample rate you will pass  
 * in the source audio for resampling.  
 * @param	outputFmt The format of the output samples.  
 * @param	inputFmt The format of the input samples.  
 * @return	A new object, or null if we can't allocate one.  
 */
  public static IAudioResampler make(int outputChannels, int inputChannels, int outputRate, int inputRate, IAudioSamples.Format outputFmt, IAudioSamples.Format inputFmt) {
    long cPtr = XugglerJNI.IAudioResampler_make__SWIG_1(outputChannels, inputChannels, outputRate, inputRate, outputFmt.swigValue(), inputFmt.swigValue());
    return (cPtr == 0) ? null : new IAudioResampler(cPtr, false);
  }

/**
 * Create a new {@link IAudioResampler} object.  
 * <p>  
 * Creation of {@link IAudioResampler} objects is relatively expensive 
 * compared  
 * to the {@link #resample(IAudioSamples, IAudioSamples, long)} method, 
 *  
 * so users are encouraged to create once and use often.  
 * </p>  
 * @param	outputChannels The number of channels you will want  
 * in resampled audio we output.  
 * @param	inputChannels The number of channels you will pass  
 * in the source audio for resampling.  
 * @param	outputRate The sample rate you will want  
 * in resampled audio we output.  
 * @param	inputRate The sample rate you will pass  
 * in the source audio for resampling.  
 * @param	outputFmt The format of the output samples.  
 * @param	inputFmt The format of the input samples.  
 * @param	filterLen The length of each filter in the filterbank, relative 
 *		 to the cutoff frequency.  
 * @param	log2PhaseCount log2 of the number of entries in the polyphase 
 *		 filterbank  
 * @param	isLinear If true, the used filter will be linearly interpolated 
 *		 between the 2 closest filters.  
 * if false, the closest will be used.  
 * @param	cutoffFrequency Cutoff frequency. 1.0 is 1/2 the output sampling 
 *		 rate.  
 * @return	A new object, or null if we can't allocate one.  
 */
  public static IAudioResampler make(int outputChannels, int inputChannels, int outputRate, int inputRate, IAudioSamples.Format outputFmt, IAudioSamples.Format inputFmt, int filterLen, int log2PhaseCount, boolean isLinear, double cutoffFrequency) {
    long cPtr = XugglerJNI.IAudioResampler_make__SWIG_2(outputChannels, inputChannels, outputRate, inputRate, outputFmt.swigValue(), inputFmt.swigValue(), filterLen, log2PhaseCount, isLinear, cutoffFrequency);
    return (cPtr == 0) ? null : new IAudioResampler(cPtr, false);
  }

}
