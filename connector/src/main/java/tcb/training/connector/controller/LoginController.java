package tcb.training.connector.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginPage(@RequestParam Optional<String> error) {
        LOGGER.debug("Getting login page, error={}", error);
        return new ModelAndView("login", "error", error);
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET, params = {"error"})
    public String loginError(@RequestParam Optional<String> error, ModelMap model, HttpServletResponse response) {
        LOGGER.debug("Error login, error={}", error);
        model.put("error",error);
        response.setStatus(333);
        return "login";
    }

}
