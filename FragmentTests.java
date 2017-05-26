package ${PACKAGE_NAME};

import com.bellhops.bellhops.BuildConfig;
import com.bellhops.bellhops.TestApplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.support.v4.SupportFragmentTestUtil;

/**
 *  ${NAME}
 *  ${PROJECT_NAME}
 *
 *  Created by ${USER} on ${DATE}.
 *  Copyright (c) ${YEAR} YourCompany. All rights reserved.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, application = TestApplication.class)
public class ${NAME}FragmentTests {

    // Subject Under Test

    private ${NAME}Fragment sut;

    // Spies

    private ${NAME}ViewInteractorContractSpy outputSpy;
    private ${NAME}RouterInterfaceSpy routerSpy;

    // Test Life Cycle

    @Before
    public void setUp() {
        setup${NAME}Fragment();
    }

    @After
    public void tearDown() {
    }

    // Setup

    private void setup${NAME}Fragment() {
        sut = new ${NAME}Fragment();

        // Start Fragment with Robolectric
        SupportFragmentTestUtil.startVisibleFragment(sut);

        outputSpy = new ${NAME}ViewInteractorContractSpy();
        sut.output = outputSpy;

        routerSpy = new ${NAME}RouterInterfaceSpy();
        sut.router = routerSpy;
    }

    // Test Doubles

    private class ${NAME}ViewInteractorContractSpy implements ${NAME}Contracts.ViewInteractorContract {

        // TODO
    }

    private class ${NAME}RouterInterfaceSpy implements ${NAME}Contracts.RouterInterface {

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
