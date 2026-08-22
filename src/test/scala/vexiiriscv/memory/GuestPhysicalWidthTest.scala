package vexiiriscv.memory

import org.scalatest.funsuite.AnyFunSuite

class GuestPhysicalWidthTest extends AnyFunSuite {
  test("Sv39x4 accepts 41-bit guest physical addresses") {
    assert(MmuSpec.sv39x4.virtualWidth == 41)
    assert(MmuSpec.sv39x4.levels.last.virtualWidth == 11)
  }
}
