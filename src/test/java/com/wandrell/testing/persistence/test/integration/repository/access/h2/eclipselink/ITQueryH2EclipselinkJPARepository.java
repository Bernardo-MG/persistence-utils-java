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

package com.wandrell.testing.persistence.test.integration.repository.access.h2.eclipselink;

import org.springframework.test.context.ContextConfiguration;

import com.wandrell.testing.persistence.util.config.context.ContextConfig;
import com.wandrell.testing.persistence.util.config.context.PersistenceContextConfig;
import com.wandrell.testing.persistence.util.config.context.RepositoryContextConfig;
import com.wandrell.testing.persistence.util.test.repository.access.AbstractITQuery;

/**
 * Integration tests for
 * {@link com.wandrell.pattern.repository.jpa.JPARepository JPARepository}
 * implementing {@code AbstractITQuery}, using an H2 in-memory database and
 * Eclipselink-based JPA.
 *
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.pattern.repository.jpa.JPARepository JPARepository
 */
@ContextConfiguration(locations = { ContextConfig.JPA_ECLIPSELINK_H2,
        PersistenceContextConfig.ECLIPSELINK, RepositoryContextConfig.JPA })
public final class ITQueryH2EclipselinkJPARepository extends AbstractITQuery {

    /**
     * Default constructor.
     */
    public ITQueryH2EclipselinkJPARepository() {
        super();
    }

}
