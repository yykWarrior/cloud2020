package com.atguigu.rbrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @version v1.0
 * @ClassName: RandomRule_yyk
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/7/4 9:46
 */
public class RandomRule_yyk extends AbstractLoadBalancerRule  {

    public RandomRule_yyk() {
    }

    int total=0;
    int currentIndex=0;
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

        /*        if(total< 5)
        {
            server=upList.get(currentIndex);
             total++;
            }else{
                 total=0;
                currentIndex++;
        if(currentIndex>=upList.size())
            {
        currentIndex=0;
        }*/

        if(total<5){
            server=upList.get(currentIndex);
            total++;
        }else{
            total=0;
            currentIndex++;
        }
        if(currentIndex>=upList.size()){
            currentIndex=0;
        }
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }


        public Server choose(Object key) {
            return this.choose(this.getLoadBalancer(), key);
        }

        public void initWithNiwsConfig(IClientConfig clientConfig) {
        }


}
