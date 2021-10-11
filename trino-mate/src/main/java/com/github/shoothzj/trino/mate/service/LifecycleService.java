package com.github.shoothzj.trino.mate.service;

import com.github.shoothzj.javatool.util.ShellUtil;
import com.github.shoothzj.trino.mate.config.TrinoConfig;
import com.github.shoothzj.trino.mate.constant.PathConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author hezhangjian
 */
@Slf4j
@Service
public class LifecycleService {

    @Autowired
    private TrinoConfig trinoConfig;

    @PostConstruct
    public void init() throws Exception {
        // start trino
        startTrino();
    }

    public void startTrino() throws Exception {
        switch (trinoConfig.deployType) {
            case STANDALONE:
                ShellUtil.executeCmd("bash -x " + PathConst.TRINO_START_STANDALONE_SCRIPT);
                break;
            default:
                break;
        }
    }

}
