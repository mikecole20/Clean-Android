package ${PACKAGE_NAME};

import java.lang.ref.WeakReference;

/**
 *  ${NAME}
 *  ${PROJECT_NAME}
 *
 *  Created by ${USER} on ${DATE}.
 *  Copyright (c) ${YEAR} YourCompany. All rights reserved.
 */
public class ${NAME}Configurator {

    // Configuration

    public static void configure(${NAME}Fragment fragment) {

        ${NAME}Router router = new ${NAME}Router();
        router.fragment = new WeakReference<>(fragment);

        ${NAME}Presenter presenter = new ${NAME}Presenter();
        presenter.output = new WeakReference<${NAME}Contracts.PresenterViewContract>(fragment);
        presenter.context = fragment.getContext();

        ${NAME}Interactor interactor = new ${NAME}Interactor();
        interactor.output = presenter;
        interactor.context = fragment.getContext();

        fragment.output = interactor;
        fragment.router = router;
    }
}
