/*
 * Copyright (C) 2012 Zach Melamed
 *
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.onix3;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Quantity reserved</h1><p>The quantity of stock on hand but unavailable to fulfil new orders for any reason – for
 * example because the stock is reserved to fulfill existing orders or frozen to prevent dispatch. Optional and
 * non-repeating.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>Positive integer or zero, suggested
 * maximum length 7 digits.</td></tr><tr><td>Reference name</td><td>&lt;Reserved&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;x536&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;1</td></tr><tr><td>Example</td><td>&lt;Reserved&gt;500&lt;/Reserved&gt;</td></tr></table>
 */
public class Reserved implements OnixElement<Integer>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "Reserved";
    public static final String shortname = "x536";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    /**
     * (type: dt.NonEmptyString)
     */
    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Raw Format: Positive integer or zero, suggested maximum length 7 digits.<p> (type: dt.PositiveInteger)
     */
    public Integer value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public Integer _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final Reserved EMPTY = new Reserved();

    public Reserved() {
        exists = false;
    }

    public Reserved(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = JPU.getContentAsInteger(element);
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
