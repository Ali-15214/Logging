package com.loggingspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class HomeController {
    /**
     * here output of home method first three log available but last two log not available in console. First three
     * log by default enable in root package.  if debug enable then higher priorities enable log mean trace
     * not enable because lower priority. if enable trace than all log enable in home method.
     *now TRACE enable in applications.properties. then check all log available in console.
     *
     * in application.properties mentions the directory logs inside myapp.log file. all logs store in this
     * file.
     *
     * spring boot by default use Slf4j with logback framework. if you customize the logback than make a xml file. In which
     * file you mentions the requirement accordingly log store the pattern.
     */


   // private static final Logger  log= LoggerFactory.getLogger(HomeController.class);

    /**
     * here use Slf4j annotations than no need to create above instance. this annotations give log reference.
     */
    @RequestMapping("/home")
    public String home(@RequestParam(defaultValue = "default value", required=false) String value) {

        log.error("error log is calling by {}",value);
        log.warn("warn log is calling by {}",value);
        log.info("info log is calling by {}",value);
        log.debug("debug log is calling by");
        log.trace("trace log is calling by");
        return "home log";
    }


}
