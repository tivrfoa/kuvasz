package com.kuvaszuptime.kuvasz.models

import io.micronaut.core.annotation.Introspected

@Introspected
data class ServiceError(
    val message: String? = "Something bad happened :("
)

class MonitorNotFoundError(
    private val monitorId: Int,
    override val message: String? = "There is no monitor with ID: $monitorId"
) : Throwable()

open class PersistenceError(
    override val message: String? = "Something bad happened in the database :("
) : Throwable()

open class DuplicationError(
    override val message: String? = "The given resource already exists"
) : PersistenceError()

class MonitorDuplicatedError(
    override val message: String? = "There is already a monitor with the given name"
) : DuplicationError()

class SchedulingError(
    override val message: String? = "Scheduling checks for the monitor did not succeed"
) : Throwable()
