package ${PACKAGE_NAME};

import com.bellhops.bellhops.BuildConfig;
import com.bellhops.bellhops.TestApplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 *  ${NAME}
 *  ${PROJECT_NAME}
 *
 *  Created by ${USER} on ${DATE}.
 *  Copyright (c) ${YEAR} YourCompany. All rights reserved.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, application = TestApplication.class)
public class ${NAME}InteractorTests {

    // Subject Under Test

    private ${NAME}Interactor sut;

    // Spies

    private ${NAME}InteractorPresenterContractSpy outputSpy;

    // Test Life Cycle

    @Before
    public void setUp() {
        setup${NAME}Interactor();
    }

    @After
    public void tearDown() {
    }

    // Setup

    private void setup${NAME}Interactor() {
        sut = new ${NAME}Interactor();

        outputSpy = new ${NAME}InteractorPresenterContractSpy();
        sut.output = outputSpy;
    }

    // Test Doubles

    private class ${NAME}InteractorPresenterContractSpy implements ${NAME}Contracts.InteractorPresenterContract {

        // TODO
    }

    // Tests

    @Test
    public void testExample() {
        // Given

        // When

        // Then
    }

}
