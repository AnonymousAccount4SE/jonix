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

package com.tectonica.jonix.onix2;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.ListOfOnixDataCompositeWithKey;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.OtherTextTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.SeriesIdentifierTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TitleTypes;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixOtherText;
import com.tectonica.jonix.struct.JonixSeriesIdentifier;
import com.tectonica.jonix.struct.JonixTitle;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

public class MainSeriesRecord implements OnixSuperComposite, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "MainSeriesRecord";
    public static final String shortname = "mainseriesrecord";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    public TextFormats textformat;

    public TextCaseFlags textcase;

    public LanguageCodes language;

    public TransliterationSchemes transliteration;

    /**
     * (type: DateOrDateTime)
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
    public static final MainSeriesRecord EMPTY = new MainSeriesRecord();

    public MainSeriesRecord() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public MainSeriesRecord(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
    }

    private void initialize() {
        if (initialized) {
            return;
        }
        initialized = true;

        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        JPU.forElementsOf(element, e -> {
            final String name = e.getNodeName();
            if (name.equals(RecordReference.refname) || name.equals(RecordReference.shortname)) {
                recordReference = new RecordReference(e);
            } else if (name.equals(NotificationType.refname) || name.equals(NotificationType.shortname)) {
                notificationType = new NotificationType(e);
            } else if (name.equals(DeletionCode.refname) || name.equals(DeletionCode.shortname)) {
                deletionCode = new DeletionCode(e);
            } else if (name.equals(DeletionText.refname) || name.equals(DeletionText.shortname)) {
                deletionText = new DeletionText(e);
            } else if (name.equals(RecordSourceType.refname) || name.equals(RecordSourceType.shortname)) {
                recordSourceType = new RecordSourceType(e);
            } else if (name.equals(RecordSourceIdentifierType.refname) ||
                name.equals(RecordSourceIdentifierType.shortname)) {
                recordSourceIdentifierType = new RecordSourceIdentifierType(e);
            } else if (name.equals(RecordSourceIdentifier.refname) || name.equals(RecordSourceIdentifier.shortname)) {
                recordSourceIdentifier = new RecordSourceIdentifier(e);
            } else if (name.equals(RecordSourceName.refname) || name.equals(RecordSourceName.shortname)) {
                recordSourceName = new RecordSourceName(e);
            } else if (name.equals(SeriesIdentifier.refname) || name.equals(SeriesIdentifier.shortname)) {
                seriesIdentifiers = JPU.addToList(seriesIdentifiers, new SeriesIdentifier(e));
            } else if (name.equals(Title.refname) || name.equals(Title.shortname)) {
                titles = JPU.addToList(titles, new Title(e));
            } else if (name.equals(Contributor.refname) || name.equals(Contributor.shortname)) {
                contributors = JPU.addToList(contributors, new Contributor(e));
            } else if (name.equals(OtherText.refname) || name.equals(OtherText.shortname)) {
                otherTexts = JPU.addToList(otherTexts, new OtherText(e));
            } else if (name.equals(Publisher.refname) || name.equals(Publisher.shortname)) {
                publishers = JPU.addToList(publishers, new Publisher(e));
            } else if (name.equals(SubordinateEntries.refname) || name.equals(SubordinateEntries.shortname)) {
                subordinateEntries = new SubordinateEntries(e);
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

    private RecordReference recordReference = RecordReference.EMPTY;

    /**
     * (this field is required)
     */
    public RecordReference recordReference() {
        initialize();
        return recordReference;
    }

    private NotificationType notificationType = NotificationType.EMPTY;

    /**
     * (this field is required)
     */
    public NotificationType notificationType() {
        initialize();
        return notificationType;
    }

    private DeletionCode deletionCode = DeletionCode.EMPTY;

    /**
     * (this field is optional)
     */
    public DeletionCode deletionCode() {
        initialize();
        return deletionCode;
    }

    private DeletionText deletionText = DeletionText.EMPTY;

    /**
     * (this field is optional)
     */
    public DeletionText deletionText() {
        initialize();
        return deletionText;
    }

    private RecordSourceType recordSourceType = RecordSourceType.EMPTY;

    /**
     * (this field is optional)
     */
    public RecordSourceType recordSourceType() {
        initialize();
        return recordSourceType;
    }

    private RecordSourceIdentifierType recordSourceIdentifierType = RecordSourceIdentifierType.EMPTY;

    /**
     * (this field is optional)
     */
    public RecordSourceIdentifierType recordSourceIdentifierType() {
        initialize();
        return recordSourceIdentifierType;
    }

    private RecordSourceIdentifier recordSourceIdentifier = RecordSourceIdentifier.EMPTY;

    /**
     * (this field is optional)
     */
    public RecordSourceIdentifier recordSourceIdentifier() {
        initialize();
        return recordSourceIdentifier;
    }

    private RecordSourceName recordSourceName = RecordSourceName.EMPTY;

    /**
     * (this field is optional)
     */
    public RecordSourceName recordSourceName() {
        initialize();
        return recordSourceName;
    }

    private ListOfOnixDataCompositeWithKey<SeriesIdentifier, JonixSeriesIdentifier, SeriesIdentifierTypes>
        seriesIdentifiers = ListOfOnixDataCompositeWithKey.emptyKeyed();

    /**
     * (this list is required to contain at least one item)
     */
    public ListOfOnixDataCompositeWithKey<SeriesIdentifier, JonixSeriesIdentifier, SeriesIdentifierTypes> seriesIdentifiers() {
        initialize();
        return seriesIdentifiers;
    }

    private ListOfOnixDataCompositeWithKey<Title, JonixTitle, TitleTypes> titles =
        ListOfOnixDataCompositeWithKey.emptyKeyed();

    /**
     * (this list is required to contain at least one item)
     */
    public ListOfOnixDataCompositeWithKey<Title, JonixTitle, TitleTypes> titles() {
        initialize();
        return titles;
    }

    private List<Contributor> contributors = Collections.emptyList();

    /**
     * (this list may be empty)
     */
    public List<Contributor> contributors() {
        initialize();
        return contributors;
    }

    private ListOfOnixDataCompositeWithKey<OtherText, JonixOtherText, OtherTextTypes> otherTexts =
        ListOfOnixDataCompositeWithKey.emptyKeyed();

    /**
     * (this list may be empty)
     */
    public ListOfOnixDataCompositeWithKey<OtherText, JonixOtherText, OtherTextTypes> otherTexts() {
        initialize();
        return otherTexts;
    }

    private List<Publisher> publishers = Collections.emptyList();

    /**
     * (this list may be empty)
     */
    public List<Publisher> publishers() {
        initialize();
        return publishers;
    }

    private SubordinateEntries subordinateEntries = SubordinateEntries.EMPTY;

    /**
     * (this field is optional)
     */
    public SubordinateEntries subordinateEntries() {
        initialize();
        return subordinateEntries;
    }
}
