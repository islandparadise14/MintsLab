package com.islandparadise14.integrationdata.local.module

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    private const val DATABASE_NAME = "database-total"

    // TODO 로컬 Entity 생길때까지 보류
//    @Provides
//    @Singleton
//    fun provideAppDatabase(
//        @ApplicationContext context: Context
//    ): AppDatabase = Room.databaseBuilder(
//        context,
//        AppDatabase::class.java,
//        DATABASE_NAME
//    ).build()
}