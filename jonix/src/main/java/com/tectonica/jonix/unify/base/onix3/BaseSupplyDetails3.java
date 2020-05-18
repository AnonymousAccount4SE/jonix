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

package com.tectonica.jonix.unify.base.onix3;

import com.tectonica.jonix.onix3.Product;
import com.tectonica.jonix.onix3.ProductSupply;
import com.tectonica.jonix.onix3.SupplyDetail;
import com.tectonica.jonix.unify.base.BaseSupplyDetail;
import com.tectonica.jonix.unify.base.BaseSupplyDetails;
import com.tectonica.jonix.unify.base.util.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * ONIX3 concrete implementation for {@link BaseSupplyDetails}
 *
 * @author Zach Melamed
 */
public class BaseSupplyDetails3 extends BaseSupplyDetails {
    private static final long serialVersionUID = 1L;

    private final transient Product product;

    public BaseSupplyDetails3(Product product) {
        this.product = product;
    }

    public static Function<SupplyDetail, ? extends BaseSupplyDetail> supplier = BaseSupplyDetail3::new;

    @Override
    protected List<BaseSupplyDetail> initialize() {
        List<BaseSupplyDetail> list = new ArrayList<>();
        for (ProductSupply ps : product.productSupplys()) { // scanning all markets, maybe not good idea
            list.addAll(Helper.createList(ps.supplyDetails(), supplier));
        }
        return list;
    }
}
