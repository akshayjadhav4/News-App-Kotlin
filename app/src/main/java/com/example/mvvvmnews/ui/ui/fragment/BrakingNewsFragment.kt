package com.example.mvvvmnews.ui.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mvvvmnews.R
import com.example.mvvvmnews.ui.ui.NewsActivity
import com.example.mvvvmnews.ui.ui.NewsViewModel


class BrakingNewsFragment : Fragment(R.layout.fragment_braking_news) {

    lateinit var viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}
