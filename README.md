[![Jenkins](https://jenkins.ci.cloudbees.com/buildStatus/icon?job=plugins/zaproxy-plugin)](https://jenkins.ci.cloudbees.com/job/plugins/job/zaproxy-plugin/)
[![Coverity](https://scan.coverity.com/projects/10792/badge.svg)](https://scan.coverity.com/projects/zaproxy-plugin)
[![Version Eye](https://www.versioneye.com/user/projects/5827738df09d22004a1d65b5/badge.svg)](https://www.versioneye.com/user/projects/5827738df09d22004a1d65b5)
[![Best Practices](https://bestpractices.coreinfrastructure.org/projects/482/badge)](https://bestpractices.coreinfrastructure.org/projects/482)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/jenkinsci/zaproxy-plugin/blob/master/LICENSE)

<br />

<a href='https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project' align="top"><img align="left" src='https://www.owasp.org/images/1/11/Zap128x128.png'></a>

<br />

[Official OWASP Zed Attack Proxy Jenkins Plugin](https://wiki.jenkins-ci.org/display/JENKINS/zaproxy+plugin)
==============================================

<br />

The OWASP Zed Attack Proxy ([ZAP](https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project)) is one of the world’s most popular free security tools and is actively maintained by hundreds of international volunteers. It can help you automatically find security vulnerabilities in your web applications while you are developing and testing your applications. Its also a great tool for experienced pentesters to use for manual security testing.

The [Official OWASP ZAP Jenkins plugin](https://wiki.jenkins-ci.org/display/JENKINS/zaproxy+plugin) is a Jenkins plugin which extends the functionality of the [ZAP](https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project) security tool into a CI Environment.

  - Manage Sessions (Load or Persist)
  - Define Context (Name, Include URLs and Exclude URLs)
  - Attack Contexts (Spider Scan, AJAX Spider, Active Scan) 

You can also:
  - Setup Authentication (Form Based or Script Based)
  - Run as Pre-Build as part of a [Selenium](http://docs.seleniumhq.org/) Build
  - Generate Reports (**.xhtml** [![XHTML](https://wiki.jenkins-ci.org/download/attachments/102662470/html.png)](http://www.w3schools.com/html/html_xhtml.asp), **.xml** [![XML](https://wiki.jenkins-ci.org/download/attachments/102662470/xml.png)](http://www.w3schools.com/xml/default.asp), **.json** [![JSON](https://wiki.jenkins-ci.org/download/attachments/102662470/json.png)](http://www.w3schools.com/js/js_json_intro.asp))

### Issue Tracking

* Issues can be created on the <b>Jenkins JIRA</b> for the component [zaproxy-plugin](https://issues.jenkins-ci.org/browse/JENKINS-39416?jql=project%20%3D%20JENKINS%20AND%20status%20in%20(Open%2C%20%22In%20Progress%22%2C%20Reopened)%20AND%20component%20%3D%20zaproxy-plugin).
* <b>Before</b> creating an Issue please read the [JIRA guidelines](https://wiki.jenkins-ci.org/display/JENKINS/How+to+report+an+issue).
* <b>Notice</b>: GitHub Issues have been disabled.

### Security Vulnerabilities

* If you find any security vulnerabilities or exploits caused by the plugin, please send a private email to one of the [maintainer(s)](https://wiki.jenkins-ci.org/display/JENKINS/zaproxy+plugin#zaproxyplugin-PluginInformation).
* <b>Notice</b>: These should be kept private until a fix is issued.

### License

	The MIT License (MIT)
	
	Copyright (c) 2016 Official ZAP Jenkins Plugin and its related class files.
	
	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:
	
	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.
	
	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.


See [License](LICENSE)