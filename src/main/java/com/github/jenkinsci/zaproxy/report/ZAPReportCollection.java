/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Official ZAP Jenkins Plugin and its related class files.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.jenkinsci.zaproxy.report;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * This class contains all ZAPreport instance of the application. It's a singleton class so the application contains only one instance of the class.
 *
 * @author Goran Sarenkapa
 * @author Mostafa AbdelMoez
 * @author Tanguy de Lignières
 * @author Abdellah Azougarh
 * @author Thilina Madhusanka
 * @author Johann Ollivier-Lapeyre
 * @author Ludovic Roucoux
 *
 */
public class ZAPReportCollection implements Serializable {

    private static final long serialVersionUID = 1L;

    private static ZAPReportCollection uniqueInstance = new ZAPReportCollection();

    /** Map where key is the report format represented by a String and value is a ZAPreport object allowing to generate a report with the corresponding format. */
    private Map<String, ZAPReport> mapFormatReport;

    private ZAPReportCollection() {
        mapFormatReport = new HashMap<String, ZAPReport>();

        /* ZAPReport's creation. */
        ZAPReportXML reportXML = new ZAPReportXML();
        ZAPReportHTML reportHTML = new ZAPReportHTML();

        /* Add ZAPReport to the map. */
        mapFormatReport.put(reportXML.getFormat(), reportXML);
        mapFormatReport.put(reportHTML.getFormat(), reportHTML);
    }

    public static ZAPReportCollection getInstance() {
        if (uniqueInstance == null) uniqueInstance = new ZAPReportCollection();

        return uniqueInstance;
    }

    public Map<String, ZAPReport> getMapFormatReport() { return mapFormatReport; }
}