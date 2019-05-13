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
import com.tectonica.jonix.OnixFlag;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Tax exempt flag</h1><p>An empty element that identifies a product price as being specifically exempted from tax.
 * Optional, and used only when &lt;PriceType&gt; indicates an exc-tax price.</p><p>Note that tax exempt status is rare:
 * it applies in only a very few countries. Tax exempt is distinct from the case where tax details are not specified (as
 * is the case with most North American Prices) and also distinct from the case where tax is levied at zero percent (as
 * is the case for physical books in the UK, for example).</p><table border='1' cellpadding='3'><tr><td>Format</td><td>XML
 * empty element</td></tr><tr><td>Reference name</td><td>&lt;TaxExempt&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;x546&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;1</td></tr><tr><td>Example</td><td>&lt;TaxExempt/&gt;</td></tr></table>
 */
public class TaxExempt implements OnixFlag, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "TaxExempt";
    public static final String shortname = "x546";

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
    // CONSTRUCTORS
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final TaxExempt EMPTY = new TaxExempt();

    public TaxExempt() {
        exists = false;
    }

    public TaxExempt(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
