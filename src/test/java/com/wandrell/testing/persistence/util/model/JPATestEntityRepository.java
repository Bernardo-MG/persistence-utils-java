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
package com.wandrell.testing.persistence.util.model;

import org.springframework.stereotype.Repository;

import com.wandrell.pattern.repository.DefaultQueryData;
import com.wandrell.persistence.repository.JPARepository;

/**
 * Test repository based on the {@link TestEntityRepository}, and using
 * {@link JPATestEntity} as the stored entities.
 * <p>
 * It is also prepared to work on Spring, to ease setting up the environment.
 * 
 * @author Bernardo Martínez Garrido
 */
@Repository
public final class JPATestEntityRepository extends JPARepository<JPATestEntity>
        implements TestEntityRepository {

    /**
     * Constructs a {@code JPATestEntityRepository}.
     */
    public JPATestEntityRepository() {
        super(new DefaultQueryData("SELECT entity FROM TestEntity entity"));
    }

}
