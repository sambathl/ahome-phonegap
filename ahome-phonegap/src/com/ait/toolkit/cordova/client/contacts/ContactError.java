/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.cordova.client.contacts;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.Attribute;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A ContactError object is returned to the contactError callback when an error occurs.
 */
public class ContactError extends JsObject {

    private ContactError(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the error code.
     * 
     * @return {@link ContactErrorCode}
     */
    public ContactErrorCode getCode() {
        return ContactErrorCode.fromValue(JsoHelper.getAttributeAsInt(jsObj, Attribute.CODE.getValue()));
    }
    
}
