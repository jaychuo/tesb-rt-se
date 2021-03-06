/*
 * #%L
 * Talend :: ESB :: Job :: API
 * %%
 * Copyright (C) 2011-2019 Talend Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package routines.system;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2019 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================

public class LocaleProvider {

    private static Map<String, Locale> cache;

    public static void main(String[] args) {

        System.out.println("FR => " + getLocale("FR")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("fr => " + getLocale("fr")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("tw => " + getLocale("tw")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("TW => " + getLocale("TW")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("zh => " + getLocale("zh")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("ZH => " + getLocale("ZH")); //$NON-NLS-1$ //$NON-NLS-2$

    }

    public static Locale getLocale(String languageOrCountyCode) {
        if (cache == null) {
            initCache();
        }
        Locale locale = null;
        if (languageOrCountyCode != null) {
            locale = cache.get(languageOrCountyCode.toLowerCase());
        }
        if (locale == null) {
            locale = Locale.ENGLISH;
        }
        return locale;
    }

    /**
     * DOC amaumont Comment method "initCache".
     */
    private static void initCache() {
        cache = new HashMap<String, Locale>();
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0; i < availableLocales.length; i++) {
            Locale locale = availableLocales[i];
            String country = locale.getCountry();
            String language = locale.getLanguage();
            String key = null;
            if (country.length() > 0) {
                key = country;
            } else if (language.length() > 0) {
                key = language;
            }
            if (key != null) {
                cache.put(key.toLowerCase(), locale);
            }
        }
    }

}
