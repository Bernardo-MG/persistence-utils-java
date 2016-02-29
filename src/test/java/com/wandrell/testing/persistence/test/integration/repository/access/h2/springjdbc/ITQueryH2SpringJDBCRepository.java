/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.wandrell.testing.persistence.test.integration.repository.access.h2.springjdbc;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.wandrell.testing.persistence.util.config.context.PersistenceContextConfig;
import com.wandrell.testing.persistence.util.config.context.RepositoryContextConfig;
import com.wandrell.testing.persistence.util.config.context.TestContextConfig;
import com.wandrell.testing.persistence.util.config.properties.DatabaseScriptsPropertiesConfig;
import com.wandrell.testing.persistence.util.config.properties.JDBCPropertiesConfig;
import com.wandrell.testing.persistence.util.config.properties.PersistenceProviderPropertiesConfig;
import com.wandrell.testing.persistence.util.config.properties.QueryPropertiesConfig;
import com.wandrell.testing.persistence.util.config.properties.RepositoryPropertiesConfig;
import com.wandrell.testing.persistence.util.config.properties.TestPropertiesConfig;
import com.wandrell.testing.persistence.util.config.properties.UserPropertiesConfig;
import com.wandrell.testing.persistence.util.test.repository.access.AbstractITQuery;

/**
 * Integration tests for
 * {@link com.wandrell.pattern.repository.spring.SpringJDBCRepository
 * SpringJDBCRepository} implementing {@code AbstractITQuery}, using an H2
 * in-memory database and Spring JDBC.
 *
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.pattern.repository.spring.SpringJDBCRepository
 *      SpringJDBCRepository
 */
@ContextConfiguration(locations = { TestContextConfig.DEFAULT,
        PersistenceContextConfig.SPRING_JDBC,
        RepositoryContextConfig.SPRING_JDBC })
@TestPropertySource(locations = { QueryPropertiesConfig.JDBC_QUERY,
        RepositoryPropertiesConfig.SPRING_JDBC, TestPropertiesConfig.ENTITY,
        PersistenceProviderPropertiesConfig.SPRING_JDBC,
        UserPropertiesConfig.DEFAULT, DatabaseScriptsPropertiesConfig.MSSQL,
        JDBCPropertiesConfig.H2 },
        properties = {
                "jdbc.url=jdbc:h2:mem:test_spring_jdbc;DB_CLOSE_ON_EXIT=FALSE" })
public final class ITQueryH2SpringJDBCRepository extends AbstractITQuery {

    /**
     * Default constructor.
     */
    public ITQueryH2SpringJDBCRepository() {
        super();
    }

}
