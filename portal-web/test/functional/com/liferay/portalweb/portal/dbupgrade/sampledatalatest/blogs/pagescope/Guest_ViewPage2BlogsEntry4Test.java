/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.dbupgrade.sampledatalatest.blogs.pagescope;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class Guest_ViewPage2BlogsEntry4Test extends BaseTestCase {
	public void testGuest_ViewPage2BlogsEntry4() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/blogs-page-scope-community/");
		selenium.waitForVisible("link=Blogs Test Page1");
		selenium.clickAt("link=Blogs Test Page1",
			RuntimeVariables.replace("Blogs Test Page1"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(5000);
		selenium.waitForText("//span[@class='portlet-title-text']", "Blogs");
		assertEquals(RuntimeVariables.replace("Blogs"),
			selenium.getText("//span[@class='portlet-title-text']"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Title"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Content"));
		selenium.waitForVisible("//input[@id='_33_keywords']");
		selenium.type("//input[@id='_33_keywords']",
			RuntimeVariables.replace("Entry4"));
		selenium.waitForVisible("//input[@value='Search']");
		selenium.click(RuntimeVariables.replace("//input[@value='Search']"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//div[@class='portlet-msg-info']");
		assertEquals(RuntimeVariables.replace(
				"No entries were found that matched the keywords: Entry4."),
			selenium.getText("//div[@class='portlet-msg-info']"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Title"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Content"));
		selenium.open("/web/blogs-page-scope-community/");
		selenium.waitForVisible("link=Blogs Test Page2");
		selenium.clickAt("link=Blogs Test Page2",
			RuntimeVariables.replace("Blogs Test Page2"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(5000);
		selenium.waitForText("//span[@class='portlet-title-text']",
			"Blogs (Blogs Test Page2)");
		assertEquals(RuntimeVariables.replace("Blogs (Blogs Test Page2)"),
			selenium.getText("//span[@class='portlet-title-text']"));
		selenium.waitForVisible("//input[@id='_33_keywords']");
		selenium.type("//input[@id='_33_keywords']",
			RuntimeVariables.replace("Entry4"));
		selenium.waitForVisible("//input[@value='Search']");
		selenium.click(RuntimeVariables.replace("//input[@value='Search']"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(5000);
		assertFalse(selenium.isTextPresent("Blogs Entry4 Title"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Content"));
		selenium.waitForVisible("//input[@id='_33_keywords']");
		selenium.type("//input[@id='_33_keywords']",
			RuntimeVariables.replace("Entry4"));
		selenium.waitForVisible("//input[@value='Search']");
		selenium.click(RuntimeVariables.replace("//input[@value='Search']"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//div[@class='portlet-msg-info']");
		assertEquals(RuntimeVariables.replace(
				"No entries were found that matched the keywords: Entry4."),
			selenium.getText("//div[@class='portlet-msg-info']"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Title"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Content"));
		selenium.open("/web/blogs-page-scope-community/");
		selenium.waitForVisible("link=Blogs Test Page3");
		selenium.clickAt("link=Blogs Test Page3",
			RuntimeVariables.replace("Blogs Test Page3"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(5000);
		selenium.waitForText("//span[@class='portlet-title-text']",
			"Blogs (Blogs Test Page2)");
		assertEquals(RuntimeVariables.replace("Blogs (Blogs Test Page2)"),
			selenium.getText("//span[@class='portlet-title-text']"));
		selenium.waitForVisible("//input[@id='_33_keywords']");
		selenium.type("//input[@id='_33_keywords']",
			RuntimeVariables.replace("Entry4"));
		selenium.waitForVisible("//input[@value='Search']");
		selenium.click(RuntimeVariables.replace("//input[@value='Search']"));
		selenium.waitForPageToLoad("30000");
		Thread.sleep(5000);
		assertFalse(selenium.isTextPresent("Blogs Entry4 Title"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Content"));
		selenium.waitForVisible("//input[@id='_33_keywords']");
		selenium.type("//input[@id='_33_keywords']",
			RuntimeVariables.replace("Entry4"));
		selenium.waitForVisible("//input[@value='Search']");
		selenium.click(RuntimeVariables.replace("//input[@value='Search']"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//div[@class='portlet-msg-info']");
		assertEquals(RuntimeVariables.replace(
				"No entries were found that matched the keywords: Entry4."),
			selenium.getText("//div[@class='portlet-msg-info']"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Title"));
		assertFalse(selenium.isTextPresent("Blogs Entry4 Content"));
	}
}