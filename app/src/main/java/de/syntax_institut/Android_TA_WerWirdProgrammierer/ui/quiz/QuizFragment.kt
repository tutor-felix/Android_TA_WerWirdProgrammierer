package de.syntax_institut.Android_TA_WerWirdProgrammierer.ui.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import de.syntax_institut.Android_TA_WerWirdProgrammierer.databinding.FragmentQuizBinding

/**
 * Diese Klasse kümmert sich um die richtige Darstellung von UI Elementen.
 * Es ändert dabei >keine< Variablen im ViewModel
 */
class QuizFragment : Fragment() {

    // Hier wird das ViewModel, in dem die Logik stattfindet, geholt
    private val viewModel: QuizViewModel by viewModels()

    // Das binding für das QuizFragment wird deklariert
    private lateinit var binding: FragmentQuizBinding

    /**
     * Lifecycle Funktion onCreateView
     * Hier wird das binding initialisiert und das Layout gebaut
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentQuizBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * Lifecycle Funktion onViewCreated
     * Hier werden die Elemente eingerichtet und z.B. onClickListener gesetzt
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewmodel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        // Setze onClickListeners
        // TODO Schreibe hier deinen Code

        // Beobachte die gameOver Variable des viewModel, falls das Spiel vorbei ist
        // TODO Schreibe hier deinen Code
    }
}
