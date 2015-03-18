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

package com.tectonica.jonix.onix2.model;

import java.util.List;

import com.tectonica.jonix.onix2.DU;
import com.tectonica.jonix.onix2.codelist.List138;
import com.tectonica.jonix.onix2.codelist.List14;
import com.tectonica.jonix.onix2.codelist.List3;
import com.tectonica.jonix.onix2.codelist.List34;
import com.tectonica.jonix.onix2.codelist.List74;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class Header
{
	public static final String refname = "Header";
	public static final String shortname = "header";

	public List34 textformat;
	public List14 textcase;
	public List74 language;
	public List138 transliteration;
	public String datestamp; // DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public FromEANNumber fromEANNumber; // Required
	public FromSAN fromSAN; // Optional
	public List<SenderIdentifier> senderIdentifiers; // ZeroOrMore
	public FromCompany fromCompany; // Optional
	public FromPerson fromPerson; // Optional
	public FromEmail fromEmail; // Optional
	public ToEANNumber toEANNumber; // Optional
	public ToSAN toSAN; // Optional
	public List<AddresseeIdentifier> addresseeIdentifiers; // ZeroOrMore
	public ToCompany toCompany; // Optional
	public ToPerson toPerson; // Optional
	public MessageNumber messageNumber; // Optional
	public MessageRepeat messageRepeat; // Optional
	public SentDate sentDate; // Required
	public MessageNote messageNote; // Optional
	public DefaultLanguageOfText defaultLanguageOfText; // Optional
	public DefaultPriceTypeCode defaultPriceTypeCode; // Optional
	public DefaultCurrencyCode defaultCurrencyCode; // Optional
	public DefaultLinearUnit defaultLinearUnit; // Optional
	public DefaultWeightUnit defaultWeightUnit; // Optional
	public DefaultClassOfTrade defaultClassOfTrade; // Optional

	public static Header fromDoc(org.w3c.dom.Element element)
	{
		final Header x = new Header();

		x.textformat = List34.byValue(DU.getAttribute(element, "textformat"));
		x.textcase = List14.byValue(DU.getAttribute(element, "textcase"));
		x.language = List74.byValue(DU.getAttribute(element, "language"));
		x.transliteration = List138.byValue(DU.getAttribute(element, "transliteration"));
		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(FromEANNumber.refname) || name.equals(FromEANNumber.shortname))
					x.fromEANNumber = FromEANNumber.fromDoc(element);
				else if (name.equals(FromSAN.refname) || name.equals(FromSAN.shortname))
					x.fromSAN = FromSAN.fromDoc(element);
				else if (name.equals(SenderIdentifier.refname) || name.equals(SenderIdentifier.shortname))
					x.senderIdentifiers = DU.addToList(x.senderIdentifiers, SenderIdentifier.fromDoc(element));
				else if (name.equals(FromCompany.refname) || name.equals(FromCompany.shortname))
					x.fromCompany = FromCompany.fromDoc(element);
				else if (name.equals(FromPerson.refname) || name.equals(FromPerson.shortname))
					x.fromPerson = FromPerson.fromDoc(element);
				else if (name.equals(FromEmail.refname) || name.equals(FromEmail.shortname))
					x.fromEmail = FromEmail.fromDoc(element);
				else if (name.equals(ToEANNumber.refname) || name.equals(ToEANNumber.shortname))
					x.toEANNumber = ToEANNumber.fromDoc(element);
				else if (name.equals(ToSAN.refname) || name.equals(ToSAN.shortname))
					x.toSAN = ToSAN.fromDoc(element);
				else if (name.equals(AddresseeIdentifier.refname) || name.equals(AddresseeIdentifier.shortname))
					x.addresseeIdentifiers = DU.addToList(x.addresseeIdentifiers, AddresseeIdentifier.fromDoc(element));
				else if (name.equals(ToCompany.refname) || name.equals(ToCompany.shortname))
					x.toCompany = ToCompany.fromDoc(element);
				else if (name.equals(ToPerson.refname) || name.equals(ToPerson.shortname))
					x.toPerson = ToPerson.fromDoc(element);
				else if (name.equals(MessageNumber.refname) || name.equals(MessageNumber.shortname))
					x.messageNumber = MessageNumber.fromDoc(element);
				else if (name.equals(MessageRepeat.refname) || name.equals(MessageRepeat.shortname))
					x.messageRepeat = MessageRepeat.fromDoc(element);
				else if (name.equals(SentDate.refname) || name.equals(SentDate.shortname))
					x.sentDate = SentDate.fromDoc(element);
				else if (name.equals(MessageNote.refname) || name.equals(MessageNote.shortname))
					x.messageNote = MessageNote.fromDoc(element);
				else if (name.equals(DefaultLanguageOfText.refname) || name.equals(DefaultLanguageOfText.shortname))
					x.defaultLanguageOfText = DefaultLanguageOfText.fromDoc(element);
				else if (name.equals(DefaultPriceTypeCode.refname) || name.equals(DefaultPriceTypeCode.shortname))
					x.defaultPriceTypeCode = DefaultPriceTypeCode.fromDoc(element);
				else if (name.equals(DefaultCurrencyCode.refname) || name.equals(DefaultCurrencyCode.shortname))
					x.defaultCurrencyCode = DefaultCurrencyCode.fromDoc(element);
				else if (name.equals(DefaultLinearUnit.refname) || name.equals(DefaultLinearUnit.shortname))
					x.defaultLinearUnit = DefaultLinearUnit.fromDoc(element);
				else if (name.equals(DefaultWeightUnit.refname) || name.equals(DefaultWeightUnit.shortname))
					x.defaultWeightUnit = DefaultWeightUnit.fromDoc(element);
				else if (name.equals(DefaultClassOfTrade.refname) || name.equals(DefaultClassOfTrade.shortname))
					x.defaultClassOfTrade = DefaultClassOfTrade.fromDoc(element);
			}
		});

		return x;
	}
}
