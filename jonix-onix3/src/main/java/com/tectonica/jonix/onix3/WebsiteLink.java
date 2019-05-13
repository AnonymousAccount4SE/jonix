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
import com.tectonica.jonix.codelist.Languages;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Link to website</h1><p>The URL for the website. Mandatory in each occurrence of the &lt;Website&gt; composite,
 * and repeatable to provide multiple URLs where the website content is available in multiple languages. The
 * <i>language</i> attribute is optional for a single instance of &lt;WebsiteLink&gt;, but must be included in each
 * instance if &lt;WebsiteLink&gt; is repeated.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>Uniform
 * Resource Locator, expressed in full URI syntax in accordance with W3C standards, suggested maximum length 300
 * characters</td></tr><tr><td>Reference name</td><td>&lt;WebsiteLink&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;b295&gt;</td></tr><tr><td>Cardinality</td><td>1&#8230;n</td></tr><tr><td>Attributes</td><td>language</td></tr><tr><td>Example</td><td>&lt;WebsiteLink&gt;https://orders.xyzbooks.com&lt;/WebsiteLink&gt;</td></tr></table>
 */
public class WebsiteLink implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "WebsiteLink";
    public static final String shortname = "b295";

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

    public Languages language;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Raw Format: Uniform Resource Locator, expressed in full URI syntax in accordance with W3C standards, suggested
     * maximum length 300 characters<p> (type: dt.NonEmptyURI)
     */
    public String value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public String _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final WebsiteLink EMPTY = new WebsiteLink();

    public WebsiteLink() {
        exists = false;
    }

    public WebsiteLink(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
        language = Languages.byCode(JPU.getAttribute(element, "language"));

        value = JPU.getContentAsString(element);
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
