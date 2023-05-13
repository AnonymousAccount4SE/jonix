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

package com.tectonica.jonix.common.codelist;

import com.tectonica.jonix.common.OnixCodelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * marker interface to assist in IDE navigation to code-list 215 (Proximity)
 */
interface CodeList215 {
}

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 215</b>
 * <p>
 * Description: Proximity
 *
 * @see <a href="https://www.editeur.org/14/Code-Lists/">About ONIX Codelists</a>
 * @see <a href=
 *      "https://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_61.html#codelist215">ONIX
 *      Codelist 215 in Reference Guide</a>
 */
public enum Proximitys implements OnixCodelist, CodeList215 {
    Less_than("01", "Less than"),

    Not_more_than("02", "Not more than"),

    /**
     * The supplier's true figure, or at least a best estimate expected to be within 10% of the true figure (ie a quoted
     * figure of 100 could in fact be anything between 91 and 111)
     */
    Exactly("03", "Exactly"),

    /**
     * Generally interpreted as within 25% of the true figure (ie a quoted figure of 100 could in fact be anything
     * between 80 and 133). The supplier may introduce a deliberate approximation to reduce the commercial sensitivity
     * of the figure
     */
    Approximately("04", "Approximately"),

    /**
     * Generally interpreted as within a factor of two of the true figure (ie a quoted figure of 100 could in fact be
     * anything between 50 and 200). The supplier may introduce a deliberate approximation to reduce the commercial
     * sensitivity of the figure
     */
    About("05", "About"),

    Not_less_than("06", "Not less than"),

    More_than("07", "More than");

    public final String code;
    public final String description;

    Proximitys(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static Proximitys byCode(String code) {
        if (code == null || code.isEmpty()) {
            return null;
        }
        for (Proximitys e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }
}
