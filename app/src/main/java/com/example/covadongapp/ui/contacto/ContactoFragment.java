package com.example.covadongapp.ui.contacto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;

import com.example.covadongapp.R;
import com.example.covadongapp.databinding.FragmentGalleryBinding;
import com.example.covadongapp.ui.info.InfoViewModel;

public class ContactoFragment extends Fragment {

    private ContactoViewModel contactoViewModel;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactoViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(ContactoViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}