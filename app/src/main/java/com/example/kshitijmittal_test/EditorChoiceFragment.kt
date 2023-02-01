package com.example.kshitijmittal_test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class EditorChoiceFragment : Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (getArguments() != null) {
            /* mPosition = getArguments().getInt("position");*/
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.editorchoice_fragment, container, false)
    }

    companion object {
        fun newInstance(position: Int): ForYouFragment {
            val fragment = ForYouFragment()
            val args = Bundle()
            args.putInt("position", position)
            fragment.setArguments(args)
            return fragment
        }
    }

}
