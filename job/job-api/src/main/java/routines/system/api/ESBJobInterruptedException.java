/*
 * #%L
 * Talend :: ESB :: Job :: API
 * %%
 * Copyright (C) 2011-2019 Talend Inc.
 * %%
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
 * #L%
 */
package routines.system.api;

/**
 * A special type of exception
 * that will signal job waiting for request
 * that it should quit it's listening cycle (if any)
 */
public class ESBJobInterruptedException extends Exception {

    /**
     * Generated SV UID
     */
    private static final long serialVersionUID = -1570949226819610043L;

    /**
     * Constructor from parent class
     *
     * @param message
     */
    public ESBJobInterruptedException(String message) {
        super(message);
    }

    /**
     * Constructor from parent class
     *
     * @param message
     */
    public ESBJobInterruptedException(String message, Throwable e) {
        super(message, e);
    }

}
