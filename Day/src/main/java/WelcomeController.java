import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String name() {

        return "My name is Nada";
    }

    @GetMapping("/age")
    public int age() {
        return 24;
    }

    @GetMapping("/check")
    public String check() {
        return "Everything OK ";
    }


    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names() {

        ArrayList<String> names = new ArrayList<>();
        names.add("Nada");
        names.add("Khaled");
        names.add("Sarah");
        names.add("Nasser");

        return names;
    }
}


