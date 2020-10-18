package org.levelup.lesson.springlesson.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.ValidationMessage;
import com.networknt.schema.ValidationResult;
import org.levelup.lesson.springlesson.dto.Employee;
import org.levelup.lesson.springlesson.dto.ServiceAnswer;
import org.levelup.lesson.springlesson.dto.User;
import org.levelup.lesson.springlesson.service.UserService;
import org.levelup.lesson.springlesson.utils.SchemaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Set;

@Controller
public class AppController {

    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    @Autowired
    private UserService userService;
    @Autowired
    private SchemaValidator schemaValidator;
    @Autowired
    private ObjectMapper objectMapper;


    @GetMapping("/hello")
    public @ResponseBody String hello () {
        return "hello!";
    }

    @PostMapping("/adult-checker")
    public @ResponseBody
    String adultChecker(@RequestBody @Validated User user) throws JsonProcessingException {
    //String adultChecker(@RequestBody String raw) throws JsonProcessingException {
        ServiceAnswer serviceAnswer = new ServiceAnswer();

      //  ValidationResult validationResult = schemaValidator.validateSchema(raw);
      //  Set<ValidationMessage> messages = validationResult.getValidationMessages();
      //  if (!messages.isEmpty()) {
      //      return objectMapper.writeValueAsString(messages);
      //  }
     //   User user = objectMapper.readValue(raw, User.class);

//        String s = objectMapper.writeValueAsString(user);
  //      JsonNode jsonNode = objectMapper.readTree(s);
    //    System.out.println(s);

        return String.valueOf(user.getAge());
//        if (userService.isAdult(user) == null) {
//           return "fill the age";
//        } else {
//           return String.valueOf(userService.isAdult(user));
//       }
        //Validator validator = factory.getValidator();
        //Set<ConstraintViolation<User>> violations = validator.validate(user);
        //return objectMapper.writeValueAsString(violations);


    }

}
