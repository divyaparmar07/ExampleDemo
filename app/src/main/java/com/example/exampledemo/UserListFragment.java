package com.example.exampledemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.exampledemo.databinding.FragmentUserListBinding;

public class UserListFragment extends Fragment {

    private UserViewModel userViewModel;
    private FragmentUserListBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_list, container, false);
        View view = binding.getRoot();

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        binding.setLifecycleOwner(this);
        binding.setViewModel(userViewModel);

//        UserListAdapter userListAdapter = new UserListAdapter();
//        binding.recyclerView.setAdapter(userListAdapter);
//
//        userViewModel.getAllUsers().observe(getViewLifecycleOwner(), users -> {
//            userListAdapter.submitList(users);
//        });

        return view;
    }
}