package ${PACKAGE_NAME};

import com.bellhops.bellhops.BuildConfig;
import com.bellhops.bellhops.TestApplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.lang.ref.WeakReference;

/**
 *  ${NAME}
 *  ${PROJECT_NAME}
 *
 *  Created by ${USER} on ${DATE}.
 *  Copyright (c) ${YEAR} YourCompany. All rights reserved.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, application = TestApplication.class)
public class ${NAME}PresenterTests {

    // Subject Under Test

    private ${NAME}Presenter sut;

    // Spies

    private ${NAME}PresenterViewContractSpy outputSpy;

    // Test Life Cycle

    @Before
    public void setUp() {
        setup${NAME}Presenter();
    }

    @After
    public void tearDown() {
    }

    // Setup

    private void setup${NAME}Presenter() {
        sut = new ${NAME}Presenter();

        outputSpy = new ${NAME}PresenterViewContractSpy();
        sut.output = new WeakReference<${NAME}Contracts.PresenterViewContract>(outputSpy);
    }

    // Test Doubles

    private class ${NAME}PresenterViewContractSpy implements ${NAME}Contracts.PresenterViewContract {

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
