/*
 * Copyright 2021 IBM Corp. All Rights Reserved.
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

import com.ibm.watson.health.acd.v1.model.Annotation;

public class TestAnnotation {

	public static void testAnnotation(Annotation annotation) {
		Assert.assertTrue(annotation.getBegin() > -1);
		if (annotation.getCoveredText() != null && !annotation.getCoveredText().isEmpty()) {
			Assert.assertTrue(annotation.getCoveredText().length() > 0);
		}
		Assert.assertTrue(annotation.getEnd() > annotation.getBegin());
		if (annotation.getId() != null){
			Assert.assertTrue(annotation.getId().length() > 0);
		}
		if (annotation.getType() != null && !annotation.getType().isEmpty()) {
			Assert.assertTrue(annotation.getType().length() > 0);
		}
		if (annotation.getUid() != null){
			Assert.assertTrue(annotation.getUid() > 0);
		}
	}
}
