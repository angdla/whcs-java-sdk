/*
 * Copyright 2018, 2020 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.health.acd.v1.common;

import org.junit.Assert;

import com.ibm.watson.health.acd.v1.model.NegatedSpan;
import com.ibm.watson.health.acd.v1.util.CustomCollection;

public class TestNegatedSpan {

	public static void testNegatedSpan(NegatedSpan annotation) {
		Assert.assertTrue(annotation.getBegin() > -1);
		Assert.assertNotNull(annotation.getCoveredText());
		Assert.assertTrue(annotation.getEnd() > annotation.getBegin());
		Assert.assertNull(annotation.getId());
		CustomCollection trigger = annotation.getTrigger();
		TestCustomCollection.testCustomCollection(trigger);
		Assert.assertNotNull(annotation.getType());
		Assert.assertNull(annotation.getUid());
		Assert.assertNotNull(annotation.isHypothetical());
		Assert.assertNotNull(annotation.isNegated());
	}
}
