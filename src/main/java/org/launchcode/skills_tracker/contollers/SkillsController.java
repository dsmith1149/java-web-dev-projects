package org.launchcode.skills_tracker.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String homePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.  Here is the list!</h2>" +
                "<ol>" +
                "<li>Java </li>" +
                "<li>JavaScript</li>" +
                "<li> Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action = 'form' method = 'POST'><br>" +
                "<label> Name:</label><br>" +
                "<input type = 'text' name = 'name'><br>" +

                "<label> My favorite language</label><br>" +
                "<select name = 'lang1'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +

                "<label> My second favorite language</label><br>" +
                "<select name = 'lang2'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +

                "<label> My third favorite language</label><br>" +
                "<select name = 'lang3'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +

                "<input type = 'submit' value = 'Submit'/>" +

                "</form>" +
                "</body>" +
                "</html>";
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "form")
    public String results(@RequestParam String name, String lang1, String lang2, String lang3){


        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";



    }

}










