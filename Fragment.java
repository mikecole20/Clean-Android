#set ($NAME_LOWERCASE = $NAME.toLowerCase())
package ${PACKAGE_NAME};

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bellhops.bellhops.BaseFragment;
import com.bellhops.bellhops.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *  ${NAME}
 *  ${PROJECT_NAME}
 *
 *  Created by ${USER} on ${DATE}.
 *  Copyright (c) ${YEAR} YourCompany. All rights reserved.
 */
public class ${NAME}Fragment extends BaseFragment implements ${NAME}Contracts.PresenterViewContract {

    // Constants

    // UI

    // Instance Variables

    ${NAME}Contracts.ViewInteractorContract output;
    ${NAME}Contracts.RouterInterface router;

    // Constructors

    public static ${NAME}Fragment newInstance() {
        return new ${NAME}Fragment();
    }

    public ${NAME}Fragment() {
        // Required empty public constructor
    }

    // Life Cycle

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ${NAME}Configurator.configure(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_${NAME_LOWERCASE}, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    // UI Actions

    // ${NAME}Contracts.PresenterViewContract

    // Helpers

}
