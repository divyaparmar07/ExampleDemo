package com.example.exampledemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.exampledemo.databinding.FragmentAddUserBinding;

public class AddUserFragment extends Fragment {

    private UserViewModel userViewModel;
    private FragmentAddUserBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_user, container, false);
        View view = binding.getRoot();

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        binding.setLifecycleOwner(this);
        binding.setViewModel(userViewModel);

        userViewModel.getNavigateToAddUser().observe(getViewLifecycleOwner(), navigate -> {
            if (navigate) {
                // Navigate to UserListFragment
                NavHostFragment.findNavController(this).navigate(R.id.action_addUserFragment_to_userListFragment);
                userViewModel.onAddUserNavigated();
            }
        });

        return view;
    }
}
