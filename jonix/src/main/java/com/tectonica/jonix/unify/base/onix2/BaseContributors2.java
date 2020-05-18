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

package com.tectonica.jonix.unify.base.onix2;

import com.tectonica.jonix.onix2.Contributor;
import com.tectonica.jonix.onix2.Product;
import com.tectonica.jonix.onix2.Series;
import com.tectonica.jonix.unify.base.BaseContributor;
import com.tectonica.jonix.unify.base.BaseContributors;
import com.tectonica.jonix.unify.base.util.Helper;

import java.util.List;
import java.util.function.Function;

/**
 * ONIX2 concrete implementation for {@link BaseContributors}
 *
 * @author Zach Melamed
 */
public class BaseContributors2 extends BaseContributors {
    private static final long serialVersionUID = 1L;

    private final transient List<Contributor> contributors;

    public BaseContributors2(Product product) {
        contributors = product.contributors();
    }

    public BaseContributors2(Series series) {
        contributors = series.contributors();
    }

    public static Function<Contributor, ? extends BaseContributor> supplier = BaseContributor2::new;

    @Override
    protected List<BaseContributor> initialize() {
        List<BaseContributor> list = Helper.createList(contributors, supplier);
        sortBySequence(list);
        return list;
    }
}
