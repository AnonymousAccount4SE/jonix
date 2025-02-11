/*
 * Copyright (C) 2012-2023 Zach Melamed
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

import com.tectonica.jonix.common.JPU;
import com.tectonica.jonix.common.OnixElement;
import com.tectonica.jonix.common.codelist.NameIdentifierTypes;
import com.tectonica.jonix.common.codelist.RecordSourceTypes;

import java.io.Serializable;
import java.util.function.Consumer;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Affiliation identifier type</h1>
 * <p>
 * An ONIX code which identifies the scheme from which the value in the &lt;IDValue&gt; element is taken. Mandatory in
 * each occurrence of the &lt;AffiliationIdentifier&gt; composite, and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed length text, two digits</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 44</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;AffiliationIDType&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;x580&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;x580&gt;16&lt;/x580&gt;</tt> (ISNI)</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;{@link AffiliationIdentifier}&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>{@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Contributor} ⯈ {@link ProfessionalAffiliation} ⯈
 * {@link AffiliationIdentifier} ⯈ {@link AffiliationIDType}</li>
 * <li>{@link Product} ⯈ {@link ContentDetail} ⯈ {@link ContentItem} ⯈ {@link Contributor} ⯈
 * {@link ProfessionalAffiliation} ⯈ {@link AffiliationIdentifier} ⯈ {@link AffiliationIDType}</li>
 * <li>{@link Product} ⯈ {@link PromotionDetail} ⯈ {@link PromotionalEvent} ⯈ {@link Contributor} ⯈
 * {@link ProfessionalAffiliation} ⯈ {@link AffiliationIdentifier} ⯈ {@link AffiliationIDType}</li>
 * <li>{@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link Collection} ⯈ {@link Contributor} ⯈
 * {@link ProfessionalAffiliation} ⯈ {@link AffiliationIdentifier} ⯈ {@link AffiliationIDType}</li>
 * <li>{@link Product} ⯈ {@link DescriptiveDetail} ⯈ {@link NameAsSubject} ⯈ {@link ProfessionalAffiliation} ⯈
 * {@link AffiliationIdentifier} ⯈ {@link AffiliationIDType}</li>
 * <li>{@link Product} ⯈ {@link ContentDetail} ⯈ {@link ContentItem} ⯈ {@link NameAsSubject} ⯈
 * {@link ProfessionalAffiliation} ⯈ {@link AffiliationIdentifier} ⯈ {@link AffiliationIDType}</li>
 * </ul>
 *
 * @since Onix-3.10
 */
public class AffiliationIDType implements OnixElement<NameIdentifierTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "AffiliationIDType";
    public static final String shortname = "x580";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    /**
     * (type: dt.NonEmptyString)
     */
    public String sourcename;

    public RecordSourceTypes sourcetype;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    public NameIdentifierTypes value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public NameIdentifierTypes __v() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final AffiliationIDType EMPTY = new AffiliationIDType();

    public AffiliationIDType() {
        exists = false;
    }

    public AffiliationIDType(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcename = JPU.getAttribute(element, "sourcename");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));

        value = NameIdentifierTypes.byCode(JPU.getContentAsString(element));
    }

    /**
     * @return whether this tag (&lt;AffiliationIDType&gt; or &lt;x580&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }

    public void ifExists(Consumer<AffiliationIDType> action) {
        if (exists) {
            action.accept(this);
        }
    }
}
