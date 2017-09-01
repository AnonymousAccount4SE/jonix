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
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixPageRun;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Page run composite</h1><p>A repeatable group of data elements which together define a run of contiguous pages on
 * which a text item appears. The composite is optional, but may be repeated where the text item covers two or more
 * separate page runs.</p><table border='1' cellpadding='3'><tr><td>Reference name</td><td>&lt;PageRun&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;pagerun&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;n</td></tr></table>
 */
public class PageRun implements OnixDataComposite<JonixPageRun>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "PageRun";
    public static final String shortname = "pagerun";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // CONSTRUCTION
    /////////////////////////////////////////////////////////////////////////////////

    private boolean initialized;
    private final boolean exists;
    private final org.w3c.dom.Element element;
    public static final PageRun EMPTY = new PageRun();

    public PageRun() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public PageRun(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
    }

    private void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;

        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        JPU.forElementsOf(element, e -> {
            final String name = e.getNodeName();
            switch (name) {
                case FirstPageNumber.refname:
                case FirstPageNumber.shortname:
                    firstPageNumber = new FirstPageNumber(e);
                    break;
                case LastPageNumber.refname:
                case LastPageNumber.shortname:
                    lastPageNumber = new LastPageNumber(e);
                    break;
                default:
                    break;
            }
        });
    }

    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private FirstPageNumber firstPageNumber = FirstPageNumber.EMPTY;

    /**
     * (this field is required)
     */
    public FirstPageNumber firstPageNumber() {
        initialize();
        return firstPageNumber;
    }

    private LastPageNumber lastPageNumber = LastPageNumber.EMPTY;

    /**
     * (this field is optional)
     */
    public LastPageNumber lastPageNumber() {
        initialize();
        return lastPageNumber;
    }

    @Override
    public JonixPageRun asStruct() {
        initialize();
        JonixPageRun struct = new JonixPageRun();
        struct.firstPageNumber = firstPageNumber.value;
        struct.lastPageNumber = lastPageNumber.value;
        return struct;
    }
}
