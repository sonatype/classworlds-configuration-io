/**
 * Copyright (c) 2008 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.plexus.classworlds.model;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @todo 'using' keyword support, for use with 'set' keyword.
 */
public class ClassworldsAppConfiguration
{

    private String mainClass;

    private String mainRealm;

    private Map<String, String> systemProperties = new LinkedHashMap<String, String>();

    private Map<String, ClassworldsRealmConfiguration> realmConfigurations = new LinkedHashMap<String, ClassworldsRealmConfiguration>();

    public String getMainClass()
    {
        return mainClass;
    }

    public ClassworldsAppConfiguration setMainClass( String mainClass )
    {
        this.mainClass = mainClass;

        return this;
    }

    public String getMainRealm()
    {
        return mainRealm;
    }

    public ClassworldsAppConfiguration setMainRealm( String mainRealm )
    {
        this.mainRealm = mainRealm;

        return this;
    }

    public Map<String, String> getSystemProperties()
    {
        return systemProperties;
    }

    public ClassworldsAppConfiguration setSystemProperties( Map<String, String> systemProperties )
    {
        this.systemProperties = systemProperties;

        return this;
    }

    public ClassworldsAppConfiguration setSystemProperty( String key,
                                                          String value )
    {
        systemProperties.put( key, value );

        return this;
    }

    public boolean hasSystemProperties()
    {
        return !systemProperties.isEmpty();
    }

    public LinkedHashSet<ClassworldsRealmConfiguration> getRealmConfigurations()
    {
        return new LinkedHashSet<ClassworldsRealmConfiguration>( realmConfigurations.values() );
    }

    public Map<String, ClassworldsRealmConfiguration> getRealmConfigurationMap()
    {
        return realmConfigurations;
    }

    public ClassworldsAppConfiguration setRealmConfigurations( Map<String, ClassworldsRealmConfiguration> realmConfigurations )
    {
        this.realmConfigurations = realmConfigurations;

        return this;
    }

    public ClassworldsAppConfiguration addRealmConfiguration( ClassworldsRealmConfiguration realmConfiguration )
    {
        realmConfigurations.put( realmConfiguration.getRealmId(), realmConfiguration );

        return this;
    }

}
