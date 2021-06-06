package com.open.source.json.helper.core.process;

/**
 * Interface is designed to process all/any operation.<br> 
 * Idea is to provide a handle to operate, All auxillary or Processors are accessed via Process method.
 * Accepts Input of type {@link I} and 
 * process it to return output of type {@link O}
 */
interface Processor<I,O>{
    /**
     * Process input of type {@link I} to provide expected output of type {@link O}.
     * @param input of type {@link I}
     * @return output of Type {@link O}
     */
    O process(I input);
}