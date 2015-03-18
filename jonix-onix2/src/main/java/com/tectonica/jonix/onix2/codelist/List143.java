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

package com.tectonica.jonix.onix2.codelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

/**
 * US CPSIA choking hazard warning code
 */
public enum List143
{
	/**
	 * Required on applicable products sold in the US.
	 */
	WARNING__CHOKING_HAZARD___Small_parts___Not_for_children_under_3_yrs_("01"), //

	/**
	 * Required on applicable products sold in the US.
	 */
	WARNING__CHOKING_HAZARD___Children_under_8_yrs__can_choke_or_suffocate_on_uninflated_or_broken_balloons__Adult_supervision_required___Keep_uninflated_balloons_from_children__Discard_broken_balloons_at_once_(
			"02"), //

	/**
	 * Required on applicable products sold in the US.
	 */
	WARNING__CHOKING_HAZARD___This_toy_is_a_small_ball___Not_for_children_under_3_yrs_("03"), //

	/**
	 * Required on applicable products sold in the US.
	 */
	WARNING__CHOKING_HAZARD___Toy_contains_a_small_ball___Not_for_children_under_3_yrs_("04"), //

	/**
	 * Required on applicable products sold in the US.
	 */
	WARNING__CHOKING_HAZARD___This_toy_is_a_marble___Not_for_children_under_3_yrs_("05"), //

	/**
	 * Required on applicable products sold in the US.
	 */
	WARNING__CHOKING_HAZARD___Toy_contains_a_marble___Not_for_children_under_3_yrs_("06"), //

	/**
	 * To be used when a supplier wishes to make a clear statement that no such warning is applicable to product.
	 */
	No_choking_hazard_warning_necessary("07");

	public final String value;

	private List143(String value)
	{
		this.value = value;
	}

	public static List143 byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (List143 e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
