package com.king.mvvm.news.di.module

import com.king.frame.mvvmframe.di.module.ViewModelFactoryModule
import dagger.Module

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Module(includes = [ViewModelFactoryModule::class,NewsViewModelModule::class,NewsActivityModule::class,NewsFragmentModule::class])
class NewsApplicationModule {

}