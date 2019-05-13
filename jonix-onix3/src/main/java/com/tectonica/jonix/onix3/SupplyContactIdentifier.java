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
import com.tectonica.jonix.OnixComposite.OnixDataCompositeWithKey;
import com.tectonica.jonix.codelist.NameIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixSupplyContactIdentifier;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Supply contact identifier composite</h1><p>A group of data elements which together specify an identifier for the
 * supply contact. The composite is optional, and repeatable if more than one identifier of different types is sent; but
 * either a &lt;SupplyContactName&gt; or a &lt;SupplyContactIdentifier&gt; <em>must</em> be included.</p><table
 * border='1' cellpadding='3'><tr><td>Reference name</td><td>&lt;SupplyContactIdentifier&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;supplycontactidentifier&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;n</td></tr></table>
 */
public class SupplyContactIdentifier
    implements OnixDataCompositeWithKey<JonixSupplyContactIdentifier, NameIdentifierTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "SupplyContactIdentifier";
    public static final String shortname = "supplycontactidentifier";

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
    // CONSTRUCTION
    /////////////////////////////////////////////////////////////////////////////////

    private boolean initialized;
    private final boolean exists;
    private final org.w3c.dom.Element element;
    public static final SupplyContactIdentifier EMPTY = new SupplyContactIdentifier();

    public SupplyContactIdentifier() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public SupplyContactIdentifier(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
    }

    @Override
    public void _initialize() {
        if (initialized) {
            return;
        }
        initialized = true;

        JPU.forElementsOf(element, e -> {
            final String name = e.getNodeName();
            switch (name) {
                case SupplyContactIDType.refname:
                case SupplyContactIDType.shortname:
                    supplyContactIDType = new SupplyContactIDType(e);
                    break;
                case IDTypeName.refname:
                case IDTypeName.shortname:
                    idTypeName = new IDTypeName(e);
                    break;
                case IDValue.refname:
                case IDValue.shortname:
                    idValue = new IDValue(e);
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

    private SupplyContactIDType supplyContactIDType = SupplyContactIDType.EMPTY;

    /**
     * (this field is required)
     */
    public SupplyContactIDType supplyContactIDType() {
        _initialize();
        return supplyContactIDType;
    }

    private IDTypeName idTypeName = IDTypeName.EMPTY;

    /**
     * (this field is optional)
     */
    public IDTypeName idTypeName() {
        _initialize();
        return idTypeName;
    }

    private IDValue idValue = IDValue.EMPTY;

    /**
     * (this field is required)
     */
    public IDValue idValue() {
        _initialize();
        return idValue;
    }

    @Override
    public JonixSupplyContactIdentifier asStruct() {
        _initialize();
        JonixSupplyContactIdentifier struct = new JonixSupplyContactIdentifier();
        struct.supplyContactIDType = supplyContactIDType.value;
        struct.idTypeName = idTypeName.value;
        struct.idValue = idValue.value;
        return struct;
    }

    @Override
    public NameIdentifierTypes structKey() {
        return supplyContactIDType().value;
    }
}
