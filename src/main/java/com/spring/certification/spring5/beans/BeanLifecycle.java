package com.spring.certification.spring5.beans;

/*
 * The following are the stages in a bean’s lifecycle:
 *
 * Instantiate - The Spring container instantiates the bean.
 * Populate properties - Spring IoC container injects the bean’s properties.
 * Set Bean Name - Spring container sets the bean name. If the bean implements BeanNameAware, spring container passes the bean’s id to setBeanName() method.
 * Set Bean Factory - If the bean implements BeanFactoryAware, Spring container passes theBeanFactory to setBeanFactory().
 * Pre Initialization - This stage is also called the bean postprocess . If there are anyBeanPostProcessors, the Spring container calls the postProcesserBeforeInitialization () method.
 * Initialize beans - If the bean implements IntializingBean,its afterPropertySet()method is called. If the bean has init method declaration, the specified initialization method is called.
 * Post Initialization - IfBeanPostProcessors is implemented by the bean, the Spring container calls their postProcessAfterinitalization() method.
 * Ready to Use - Now the bean is ready to be used by the application.
 * Destroy - The bean is destroyed during this stage. If the bean implements DisposableBean, the Spring IoC container will call the destroy() method . If a custom destroy () method is defined, the container calls the specified method.
 *
 * To define setup and teardown methods for a bean, we simply declare the bean with init-method and/or destroy-method parameters.
 * The init-method attribute specifies a method that is to be called on the bean immediately upon instantiation. Similarly, destroy-method specifies a method that will be called just before a bean is removed from the container.
*/

@Component
public class BeanLifecycle implements LifecycleBean {

}