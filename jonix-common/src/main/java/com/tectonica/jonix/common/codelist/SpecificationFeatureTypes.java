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
 * marker interface to assist in IDE navigation to code-list 249 (Specification feature type)
 */
interface CodeList249 {
}

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 249</b>
 * <p>
 * Description: Specification feature type
 * <p>
 * Jonix-Comment: Introduced in Onix3
 *
 * @see <a href="https://www.editeur.org/14/Code-Lists/">About ONIX Codelists</a>
 * @see <a href=
 *      "https://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_61.html#codelist249">ONIX
 *      Codelist 249 in Reference Guide</a>
 */
public enum SpecificationFeatureTypes implements OnixCodelist, CodeList249 {
    /**
     * Specification Feature Value carries the filename of the final product
     */
    Filename("04", "Filename"),

    /**
     * Specification Feature Value is the target loudness in LKFS (LUFS) used for audio normalisation - see ITU-R
     * BS.1770
     */
    Audio_loudness("21", "Audio loudness"),

    /**
     * Specification Feature Description is the paper or card type, eg Coated, uncoated
     */
    Paper_type("41", "Paper type"),

    /**
     * Specification Feature Value is the paper or card weight in GSM
     */
    Paper_weight("42", "Paper weight"),

    /**
     * Specification Feature Value is the paper or card color code selected from List 257
     */
    Paper_color("43", "Paper color"),

    /**
     * Specification Feature Description lists the ink color(s) required. Do not use if mono or conventional CMYK
     */
    Ink_color_s("44", "Ink color(s)"),

    /**
     * Specification Feature Value lists a special finish required, from List 258
     */
    Special_finish("45", "Special finish");

    public final String code;
    public final String description;

    SpecificationFeatureTypes(String code, String description) {
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

    public static SpecificationFeatureTypes byCode(String code) {
        if (code == null || code.isEmpty()) {
            return null;
        }
        for (SpecificationFeatureTypes e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }
}
