/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.theme.cts;

import android.graphics.Bitmap;

/**
 * Simple interface in order to share code between the bitmap comparison and bitmap generation
 * steps.
 */
public interface BitmapProcessor {
    /**
     * Processes the bitmap that is passed into this function, either saving it or comparing
     * it against a previously generated version.
     *
     * @param bitmap The bitmap to process.
     * @return true if the bitmap was processed correctly...
     */
    public boolean processBitmap(Bitmap bitmap);
}