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

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Affiliation</h1>
 * <p>
 * An organization to which a contributor to the product was affiliated at the time of its creation, and – if the
 * &lt;ProfessionalPosition&gt; element is also present – where s/he held that position. Optional and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Variable-length text, suggested maximum length 200 characters</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;Affiliation&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;b046&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;1</td>
 * </tr>
 * <tr>
 * <td>Attributes</td>
 * <td>language</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;b046 language=&quot;spa&quot;&gt;Universidad de La Laguna&lt;/b046&gt;</td>
 * </tr>
 * </table>
 */
public class Affiliation implements OnixElement<String>, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "Affiliation";
	public static final String shortname = "b046";

	/////////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	/////////////////////////////////////////////////////////////////////////////////

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	public LanguageCodes language;

	/////////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	/////////////////////////////////////////////////////////////////////////////////

	/**
	 * Raw Format: Variable-length text, suggested maximum length 200 characters
	 * <p>
	 * (type: dt.NonEmptyString)
	 */
	public String value;

	/**
	 * Internal API, use the {@link #value} field instead
	 */
	@Override
	public String _value()
	{
		return value;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// SERVICES
	/////////////////////////////////////////////////////////////////////////////////

	private final boolean exists;
	public static final Affiliation EMPTY = new Affiliation();

	public Affiliation()
	{
		exists = false;
	}

	public Affiliation(org.w3c.dom.Element element)
	{
		exists = true;
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));

		value = JPU.getContentAsString(element);
	}

	@Override
	public boolean exists()
	{
		return exists;
	}
}
