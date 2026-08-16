# Project Cleanup Plan

Status: APPLIED (all steps 1-4 completed on 2026-08-16).

## Diagnosis

Root cause: `.gitignore.txt` is misnamed - Git only reads `.gitignore`, so nothing is ignored.

Problems found:
1. Build output committed: `out/production/Coding/` (60+ `.class` files + mirror copy of `.idea/`, `Coding.iml`, `img.png`) is tracked in git.
2. IDE config committed: `.idea/` (5 files) and `Coding.iml`.
3. Stray compiled file: `main.class` in root.
4. Flat layout: 43 `.java` files loose in root (ok for learning, but no packages).
5. Duplication: `out/production/Coding/` contains a copy of everything.

## Fix Plan

### Step 1 - Fix gitignore
- Rename `.gitignore.txt` -> `.gitignore`.
- Content:
  ```
  # IntelliJ IDEA
  .idea/
  *.iml

  # Compiled output
  out/
  *.class
  ```

### Step 2 - Untrack noise (safe, files stay on disk)
- `git rm -r --cached .idea out Coding.iml main.class`
- Stops tracking `.class` files and IDE/build files.

### Step 3 - Clean disk (optional but tidy)
- Delete `out/` folder (IntelliJ regenerates it on next build).

### Step 4 - Optional: reorganize .java into packages
- Move files into `basics/`, `operators/`, `control_flow/`, `methods/`, `programs/`; keep `OOPS/`.
- Requires adding `package` statements to ~43 files - bigger refactor, do separately if desired.