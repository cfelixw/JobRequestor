/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Path, Inc.
 * Copyright (c) 2014 Google, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.birbit.android.jobqueue;

/**
 * Called when a method is called in the wrong thread. There are 2 thread restrictions:
 * <p>
 * Some methods of the JobManager cannot be called on its own Thread where your Job's onRun method
 * is executed. If you call any of these methods in that method, you'll receive this exception.
 * <p>
 * Some methods of the JobManager may take a long time to execute. If you call these methods on
 * the main thread, it will thrown an exception.
 */
public class WrongThreadException extends RuntimeException {

    public WrongThreadException(String detailMessage) {
        super(detailMessage);
    }
}
